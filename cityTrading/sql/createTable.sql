###以下为该项目的建表语句

#商品表
CREATE TABLE `commodity` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `pv` int(11) DEFAULT '0' COMMENT '浏览量',
  `address` varchar(255) DEFAULT NULL COMMENT '所在地',
  `bargain` int(1) DEFAULT '1' COMMENT '是否可以讲价 0 否 1 是',
  `content` mediumtext COMMENT '详细内容',
  `create_time` varchar(255) DEFAULT NULL COMMENT '创建时间',
  `current_price` decimal(8,2) DEFAULT NULL COMMENT '当前价格',
  `m_id` bigint(20) NOT NULL COMMENT '商家id',
  `message_num` int(11) DEFAULT NULL,
  `method` int(1) DEFAULT '1' COMMENT '交易方式： 0 面议  1 快递',
  `original_price` decimal(8,2) DEFAULT NULL,
  `postage` double(3,2) DEFAULT NULL COMMENT '邮费',
  `quality` varchar(20) DEFAULT NULL COMMENT '质量描述 ： 全新 95成新等',
  `status` int(1) DEFAULT '0' COMMENT '状态 0 下架 1 上架',
  `title` varchar(100) DEFAULT NULL COMMENT '标题',
  `update_time` varchar(255) DEFAULT NULL COMMENT '编辑时间',
  `mc_id` bigint(20) NOT NULL COMMENT '商品分类id',
  `upvote` int(11) DEFAULT '0' COMMENT '点赞数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#商家分类表
CREATE TABLE `commodity_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `icon` varchar(255) DEFAULT NULL COMMENT '图标',
  `memo` varchar(255) DEFAULT NULL COMMENT '简短描述',
  `parent_id` bigint(20) DEFAULT '-1' COMMENT '父id',
  `title` varchar(255) NOT NULL COMMENT '标题',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#商家表
CREATE TABLE `merchant` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `create_time` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `evaluate` int(11) DEFAULT '0' COMMENT '累计评价量',
  `fullname` varchar(255) DEFAULT NULL COMMENT '真实姓名',
  `gender` int(1) DEFAULT NULL COMMENT '性别 0 男 1 女',
  `nikename` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `profile_picture` varchar(255) DEFAULT NULL COMMENT '头像',
  `update_time` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `volume` int(11) DEFAULT '0' COMMENT '成交量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

