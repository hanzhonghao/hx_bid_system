package com.magicalcoder.youyaboot.admin.api.score;

import com.magicalcoder.youyaboot.core.common.constant.PageConstant;
import com.magicalcoder.youyaboot.core.serialize.ResponseMsg;
import com.magicalcoder.youyaboot.core.service.CommonRestController;
import com.magicalcoder.youyaboot.core.utils.DateFormatUtil;
import com.magicalcoder.youyaboot.core.utils.ExportPOIUtils;
import com.magicalcoder.youyaboot.model.Project;
import com.magicalcoder.youyaboot.model.Score;
import com.magicalcoder.youyaboot.model.ScoreCategory;
import com.magicalcoder.youyaboot.service.project.service.ProjectService;
import com.magicalcoder.youyaboot.service.score.service.ScoreService;
import com.magicalcoder.youyaboot.service.scorecategory.service.ScoreCategoryService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
* 代码为自动生成 Created by www.magicalcoder.com
* 软件作者：何栋宇 qq:709876443
* 如果你改变了此类 read 请将此行删除
* 欢迎加入官方QQ群:648595928
*/

@RequestMapping("/admin/score_rest/")
@RestController
public class AdminScoreRestController extends CommonRestController<Score,Long> implements InitializingBean
{

    @Resource
    private ScoreService scoreService;

    @Resource
    private ProjectService projectService;

    @Resource
    private ScoreCategoryService scoreCategoryService;

        //分页查询
    @RequestMapping(value={"page"}, method={RequestMethod.GET})
    public ResponseMsg page(
        @RequestParam(required = false,value ="categoryIdFirst")                            Integer categoryIdFirst ,
        @RequestParam(required = false,value ="dateFirst")                    @DateTimeFormat(pattern = "yyyy-MM-dd")Date dateFirst ,
        @RequestParam(required = false,value ="projectIdFirst")                            Long projectIdFirst ,
        @RequestParam int page,@RequestParam int limit,@RequestParam(required = false) String safeOrderBy
        ,HttpServletResponse response,@RequestParam(required = false) Integer queryType
    ){
        Map<String,Object> query = new HashMap();
        query.put("categoryIdFirst",categoryIdFirst);
        query.put("dateFirst",dateFirst);
        query.put("projectIdFirst",projectIdFirst);
        Integer count = scoreService.getModelListCount(query);
        query.put("safeOrderBy",safeOrderBy);
        if(queryType==null || queryType == QUERY_TYPE_SEARCH){//普通查询
            limit = Math.min(limit, PageConstant.MAX_LIMIT);
            query.put("start",(page - 1) * limit);query.put("limit",limit);
            return new ResponseMsg(count,scoreService.getModelList(query));
        }else if(queryType == QUERY_TYPE_EXPORT_EXCEL){
            query.put("start",(page - 1) * limit);query.put("limit",limit);

            String fileName = "评标打分汇总表";
            // 列名
            String columnNames[] = {"编号","参选公司","打分表分类","商务技术要求响应情况","备注","售后服务方案情况","投标文件供应商业绩","制造厂商综合情况","投标文件规范性","日期","专家签名"};
            // map中的key
            String keys[] = { "numbers","project_str", "category_str", "techRequire", "comment","afterSale", "apply", "geneSitu","standard","dates","signature"};
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                List<Score> scoreList = scoreService.getModelList(query);
                for (int i=1;i<=scoreList.size();i++){
                    scoreList.get(i-1).setNumbers(i);
                    Long projectId = scoreList.get(i - 1).getProjectId();
                    Project model = projectService.getModel(projectId);
                    scoreList.get(i-1).setProject_str(model.getProjectName());

                    Long categoryId = scoreList.get(i - 1).getCategoryId();
                    ScoreCategory model1 = scoreCategoryService.getModel(categoryId);
                    scoreList.get(i-1).setCategory_str(model1.getChildCategore());

                    String format = sdf.format(scoreList.get(i - 1).getDate());
                    scoreList.get(i-1).setDates(format);

                }

                ExportPOIUtils.start_download(response, fileName, scoreList, columnNames, keys);
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        super.commonService = scoreService;
        super.primaryKey = "id";//硬编码此实体的主键

        // 名称
    }

    //查询当天专家
    @RequestMapping(value = {"getDayZhangJia"}, method = {RequestMethod.POST})
    public ResponseMsg getDayZhangJia(String date) {
        if (StringUtils.isBlank(date)) {
            date = DateFormatUtil.getDateTimeStr();
        }
        List<String> zhangJiaList = scoreService.getDayZhangJia(date);
        return new ResponseMsg(zhangJiaList);
    }

}
