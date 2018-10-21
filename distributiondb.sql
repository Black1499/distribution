drop database if exists distributiondb;
create database distributiondb;
use distributiondb;

create table dis_customer(
	customer_id varchar(20),
	customer_name varchar(20),
	customer_sex char(10),
	customer_psd varchar(20),
	birthday datetime,
	tel varchar(20),
	address varchar(50),
	`comment` varchar(100),
	primary key (customer_id)
);

insert into dis_customer values('001','张三','男','123456','1990-10-10','13103961499','珠海南坪街口','');
insert into dis_customer values('002','李四','男','333456','1992-12-10','13103961599','珠海北坪街口','');
insert into dis_customer values('003','王五','男','223456','1993-11-10','13103961699','珠海西坪街口','');
insert into dis_customer values('004','赵柳','男','113456','1994-10-10','13103961799','珠海东坪街口','');
insert into dis_customer values('005','田器','男','553456','1995-11-10','13103961899','珠海中坪街口','');



create table dis_province(
	province_id varchar(20),
	province_name varchar(20),
	primary key (province_id)
);

insert into dis_province values('001','广东省');
insert into dis_province values('002','广西省');
insert into dis_province values('003','山东省');
insert into dis_province values('004','山西省');

create table dis_city(
	city_id varchar(20),
	province_id varchar(20),
	city_name varchar(20),
	province_name varchar(20),
	primary key (city_id),
	foreign key (province_id) references dis_province(province_id) 
);

insert into dis_city values ('001','001','珠海市','广东省');
insert into dis_city values ('002','001','中山市','广东省');
insert into dis_city values ('003','001','广州市','广东省');
insert into dis_city values ('004','002','南宁市','广西省');
insert into dis_city values ('005','002','北海市','广西省');

create table dis_city_area(
	area_id varchar(20),
	city_id varchar(20),
	area_name varchar(20),
	city_name varchar(20),
	primary key (area_id),
	foreign key (city_id) references dis_city(city_id)
);

insert into dis_city_area values('001','001','斗门区','珠海市');
insert into dis_city_area values('002','001','金湾区','珠海市');
insert into dis_city_area values('003','001','香洲区','珠海市');
insert into dis_city_area values('004','003','白云区','广州市');

create table dis_route(
	route_id varchar(20),
	city_id varchar(20),
	province_id varchar(20),
	route_name varchar(20),
	start_province varchar(20),
	start_city varchar(20),
	end_province varchar(20),
	end_city varchar(20),
	mid_province varchar(20),
	mid_city varchar(20),
	transport_price decimal(20),
	`comment` varchar(20),
	primary key (route_id),
	foreign key (city_id) references dis_city(city_id),
	foreign key (province_id) references dis_province(province_id)
);


insert into dis_route values ('001','001','001','珠深','广东省','珠海','广东省','深圳','无','无',35,'');
insert into dis_route values ('002','001','001','广深','广东省','广州','广东省','深圳','无','无',32,'');
insert into dis_route values ('003','001','001','深山','广东省','深圳','广东省','汕头','无','无',65,'');
insert into dis_route values ('004','001','001','广澳','广东省','广州','广东省','澳门','无','无',45,'');

create table dis_car(
	car_id varchar(20),
	route_id varchar(20),
	car_type varchar(20),
	car_orgin varchar(50),
	car_prodate datetime,
	car_buytime datetime,
	car_capacity int,
	car_state bit,
	comment varchar(100),
	primary key (car_id),
	foreign key (route_id) references dis_route(route_id)
);

insert into dis_car values ('001','001','中型','20','2016-12-12','2016-12-20',45,0,'');
insert into dis_car values ('002','002','大型','20','2016-11-12','2016-12-20',60,0,'');
insert into dis_car values ('003','003','中型','20','2016-10-12','2016-12-20',45,0,'');
insert into dis_car values ('003','002','小型','20','2016-09-12','2016-12-20',30,1,'');
insert into dis_car values ('005','004','中型','20','2016-08-12','2016-12-20',45,1,'');

create table dis_order(
	order_id varchar(20),
	car_id varchar(20),
	customer_id varchar(20),
	post_pname varchar(20),
	post_ptel varchar(20),
	post_paddr varchar(50),
	get_pname varchar(20),
	get_ptel varchar(20),
	get_paddr varchar(50),
	goods_name varchar(100),
	goods_weight int,
	order_type varchar(10),
	order_state varchar(20),
	transport_price decimal(20),
	delivery_price decimal(20),
	total_price varchar(20),
	`comment` varchar(100),
	primary key (order_id),
	foreign key (car_id) references dis_car(car_id),
	foreign key (customer_id) references dis_customer(customer_id)
);


insert into dis_order values('001','001','004','张三','13102312412','珠海斗门','王天','13912314411','深圳金飒大厦','冰箱',200,'电器','未到',100,123,223,'');
insert into dis_order values('002','002','003','王田','13102312222','珠海斗门','阿天','13916614411','深圳但是大厦','冰箱',180,'电器','未到',100,103,203,'');
insert into dis_order values('003','003','002','赵柳','13102311232','珠海斗门','安多','13912353211','深圳搭嘎大厦','冰箱',220,'电器','未到',100,153,253,'');
insert into dis_order values('004','004','001','田表','13102334122','珠海斗门','阿斯','13912312341','汕头网编路口','冰箱',200,'电器','未到',100,123,223,'');

create table dis_delivery_receipt(
	delivery_receipt_id varchar(20),
	start_city varchar(20),
	end_city varchar(20),
	mid_city varchar(20),
	make_date datetime,
	`state` varchar(20),
	`comment` varchar(20),
	primary key (delivery_receipt_id)
);


insert into dis_delivery_receipt values('001','珠海市','汕头市','揭阳市','2018-10-11','接受','');
insert into dis_delivery_receipt values('002','珠海市','潮州市','揭阳市','2018-10-11','接受','');
insert into dis_delivery_receipt values('003','珠海市','梅州市','揭阳市','2018-10-12','接受','');
insert into dis_delivery_receipt values('004','珠海市','普宁市','揭阳市','2018-10-17','接受','');

create table dis_association(
	ord_order_id varchar(20),
	del_delivery_receipt_id varchar(20),
	order_id varchar(20),
	delivery_receipt_id varchar(20)
);
insert into dis_association values('001','001','001','001');
insert into dis_association values('002','002','002','002');
insert into dis_association values('003','003','003','003');

create table dis_role(
	role_id varchar(20),
	role_name varchar(20),
	`comment` varchar(100),
	primary key (role_id)
);
insert into dis_role values('001','刘依依','');
insert into dis_role values('002','黎明','');
insert into dis_role values('003','刘邓','');
insert into dis_role values('004','邓稼','');
insert into dis_role values('005','张亮','');

create table dis_manager(
	manager_id varchar(20),
	role_id varchar(20),
	manager_name varchar(20),
	manager_psd varchar(20),
	manager_sex char(10),
	tel varchar(20),
	address varchar(50),
	`comment` varchar(100),
	primary key (manager_id),
	foreign key (role_id) references dis_role(role_id)
);

insert into dis_manager values('001','001','刘依依','12312312','女','13190902312','白蕉南路','');
insert into dis_manager values('002','002','黎明','123sdfa','男','13190942412','白蕉东路','');
insert into dis_manager values('003','003','刘邓','1231sdfa2312','男','1319125722','白蕉北路','');
insert into dis_manager values('004','004','邓稼','123123ddd12','男','13190902232','白蕉西路','');

create table dis_delivery_place(
	dep_id varchar(20),
	manager_id varchar(20),
	dep_name varchar(20),
	province_name varchar(20),
	city_name varchar(20),
	manager_name varchar(20),
	dep_tel varchar(20),
	dep_addr varchar(20),
	`comment` varchar(100),
	primary key (dep_id),
	foreign key (manager_id) references dis_manager(manager_id)
);

insert into dis_delivery_place values('001','001','珠海','广东','珠海市','刘依依','13190902312','白蕉南路','');
insert into dis_delivery_place values('002','002','深圳','广东','深圳市','黎明','13190942412','白蕉东路','');
insert into dis_delivery_place values('003','003','汕头','广东','汕头市','刘邓','1319125722','白蕉北路','');

create table dis_delivery_range(
	range_id varchar(20),
	dep_id varchar(20),
	area_id varchar(20),
	range_name varchar(20),
	delivery_price decimal(20),
	`comment` varchar(20),
	primary key (range_id),
	foreign key (dep_id) references dis_delivery_place(dep_id),
	foreign key (area_id) references dis_city_area (area_id)
);

insert into dis_delivery_range values('001','001','001','广深',231,'');
insert into dis_delivery_range values('002','004','003','广惠',281,'');
insert into dis_delivery_range values('003','001','001','深汕',251,'');
insert into dis_delivery_range values('004','003','002','广奥',531,'');



select * from dis_customer;
select * from dis_province;
select * from dis_city;
select * from dis_city_area;
select * from dis_route;
select * from dis_car;
select * from dis_order;
select * from dis_delivery_receipt;
select * from dis_association;
select * from dis_role;
select * from dis_manager;
select * from dis_delivery_place;
select * from dis_delivery_range;


