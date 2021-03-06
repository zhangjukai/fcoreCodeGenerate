package com.fcore.commons;

/**   
* @Title: Constans.java 
* @Package com.gogotown.commons 
* @Description: 常量定义
* @author zhangkui
* @date 2016年03月08日 下午10:15:38
* @version V1.0   
*/
public interface Constans {
	 /**@Fields COLNAMES : 列名*/ 
	String COLNAMES = "colnames";
	 /**@Fields COLTYPES : 列类型*/ 
	String COLTYPES = "colTypes";
	 /**@Fields FIELDNAMES : 字段名称*/ 
	String FIELDNAMES = "fieldNames";
	 /**@Fields REMARKS : 字段备注信息*/ 
	String REMARKS = "remarks";
	 /**@Fields TABLE_DESCRIPTION : 表备注*/ 
	String TABLE_DESCRIPTION = "table_description";
	 /**@Fields TABLENAME : 表名称*/ 
	String TABLENAME = "tableName";
	 /**@Fields AUTHOR_NAME : 作者*/ 
	String AUTHOR_NAME = "authorName";
	/**是否覆盖已经生成过的文件*/
	String ISCOVER = "isCover";
	 /**@Fields PRIMARY_COLUMN_TAB : 表主键*/ 
	String PRIMARY_COLUMN_TAB = "primary_column_tab";
	////model、dao、service、action的名字//
	String TYPE_MODEL = "entity";
	String TYPE_DAO = "dao";
	String TYPE_SERVICE = "service";
	String TYPE_ACTION = "controller";
	
	//模版文件名称配置
	String TEMPLATE_SERVICE = "service.ftl";
	String TEMPLATE_ACTION = "action.ftl";
	String TEMPLATE_DAO = "dao.ftl";
	String TEMPLATE_LIST  = "list.ftl";
	String TEMPLATE_EDIT = "edit.ftl";
	String TEMPLATE_ENTITY = "entity.ftl";
	String TEMPLATE_PROPERTIE = "propertie.ftl";
	String TEMPLATE_I_SERVICE = "iservice.ftl";
	String TEMPATE_I_DAO = "idao.ftl";
	String TEMPLATE_MAPPER = "mapper.ftl";
	String TEMPLATE_MAPPER_JAVA = "mapperjava.ftl";
	
	String WEB_XML_PATH = "webapp.WEB-INF";
	String WEB_JSP_PATH = "resources.templates.views";
	String XML_SPRING_DAO_PATH = "resource";
	
	//生成数据库对应实体排除公有字段定义
	String EXCLUDE_FIELD_ARR [] = new String[] {"lastUpdatedStamp","lastUpdatedTxStamp","createdStamp","createdTxStamp"};
}
