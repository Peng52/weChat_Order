商品表：
create table  PRODUCT (
	PRODUCT_ID  varchar(32) not null   comment '商品ID',
	PRODUCT_PRICE decimal(8,2) not null comment '商品单价',
	PRODUCT_NAME varchar(255) not null comment '商品名称',
	PRODUCT_STOCK int not null comment '库存',
	CATEGORY_TYPE int not null comment '所属类别',
	PRODUCT_ICON varchar(255) comment '商品图片链接',
	PRODUCT_DESCRIPTION varchar(512) comment '商品描述',
	CREATE_TIME timestamp not null default current_timestamp comment '创建时间',
	update_time timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
	primary key (PRODUCT_ID)
) comment '商品表';

商品类目表：
create table product_category (
	category_id int not null auto_increment comment '类目ID',
	category_name varchar(64) not null comment '类目名称',
	category_type int not null comment '类目类型',
	create_time timestamp not null default current_timestamp comment '创建时间',
	update_time timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
	primary key (category_id),
	unique index idx_category_type (category_type)
) comment '商品类目表';

订单表：
create table order_master (
	order_id varchar(32) not null comment 订单号,
	buyer_name varchar(32) not null comment 买家姓名,
	buyer_address varchar(255) not null comment 买家地址,
	buyer_phoneNum varchar(32) not null comment 买家手机号,
	buyer_opengId varchar(64) not null comment 买家微信号,
	buyer_price decimal(8,2) not null comment 消费金额,
	order_status tinyint(3) not null default 0 comment 订单状态,0 默认下单,
	pay_status tinyint(300) not null default 0 comment 支付状态，0 默认未支付
	create_time timestamp not null default current_timestamp comment 创建时间,
	update_time timestamp not null default current_timestamp on update current_timestamp comment 修改时间,
	primary key (order_id),
	key idx_buyer_opengId_key (buyer_opengId) 
) comment 订单表

订单详情：
create table order_detail(
	detail_id varchar(32) not null comment 订单详情ID,
	order_id varchar(32) not null comment 订单ID,
	product_id varchar(32) not null comment 商品ID,
	product_name varchar(255) not null comment 商品名称,
	product_price decimal(8,2) not null comment 商品价格,
	product_quantity int not null comment 商品的数量,
	product_icon varchar(255) not null comment 商品图片链接,
	create_time timestamp not null default current_timestamp comment 创建时间,
	update_time timestamp not null default current_timestamp on update current_timestamp comment 更新时间, 
	primary key (detail_id),
	key idx_order_id (order_id)
) comment 订单详情



存在很多的问题没有得到解决











