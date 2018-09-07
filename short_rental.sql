/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50723
Source Host           : localhost:3306
Source Database       : short_rental

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2018-09-07 17:34:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_file
-- ----------------------------
DROP TABLE IF EXISTS `sys_file`;
CREATE TABLE `sys_file` (
  `file_id` int(11) NOT NULL,
  `file_nam` varchar(255) DEFAULT NULL,
  `file_url` varchar(255) DEFAULT NULL,
  `file_cre_tim` datetime DEFAULT NULL,
  `file_room` int(11) DEFAULT NULL,
  `file_order` int(11) DEFAULT NULL,
  `file_use` int(11) DEFAULT NULL,
  PRIMARY KEY (`file_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_file
-- ----------------------------

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `menu_id` int(11) NOT NULL,
  `menu_name` varchar(255) DEFAULT NULL,
  `menu_url` varchar(255) DEFAULT NULL,
  `menu_code` varchar(255) DEFAULT NULL COMMENT '标识',
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------

-- ----------------------------
-- Table structure for sys_order
-- ----------------------------
DROP TABLE IF EXISTS `sys_order`;
CREATE TABLE `sys_order` (
  `order_id` varchar(255) NOT NULL,
  `order_cre_tim` datetime DEFAULT NULL,
  `order_sta_tim` date DEFAULT NULL,
  `order_end_tim` date DEFAULT NULL,
  `order_rental` int(10) DEFAULT NULL COMMENT '租金',
  `order_room` int(11) DEFAULT NULL,
  `order_use` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_order
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `id` int(11) NOT NULL,
  `role_id` int(11) DEFAULT NULL,
  `menu_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------

-- ----------------------------
-- Table structure for sys_room
-- ----------------------------
DROP TABLE IF EXISTS `sys_room`;
CREATE TABLE `sys_room` (
  `room_id` int(11) NOT NULL,
  `room_addr` varchar(255) DEFAULT NULL,
  `room_hold` int(1) DEFAULT NULL COMMENT '0可租， 1在租',
  `room_use` int(11) DEFAULT NULL,
  PRIMARY KEY (`room_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_room
-- ----------------------------

-- ----------------------------
-- Table structure for sys_type
-- ----------------------------
DROP TABLE IF EXISTS `sys_type`;
CREATE TABLE `sys_type` (
  `type_id` int(11) NOT NULL,
  `type_name` varchar(255) DEFAULT NULL,
  `type_room` int(11) DEFAULT NULL,
  `type_menu` int(11) DEFAULT NULL,
  `type_use` int(11) DEFAULT NULL,
  `type_file` int(11) DEFAULT NULL,
  `type_order` int(11) DEFAULT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_type
-- ----------------------------

-- ----------------------------
-- Table structure for sys_use
-- ----------------------------
DROP TABLE IF EXISTS `sys_use`;
CREATE TABLE `sys_use` (
  `use_id` int(255) NOT NULL AUTO_INCREMENT,
  `use_nam` varchar(255) DEFAULT NULL COMMENT '身份证号',
  `use_idc` varchar(18) DEFAULT NULL,
  `use_sex` int(1) DEFAULT NULL,
  `use_age` varchar(3) DEFAULT NULL,
  `use_tel` varchar(11) DEFAULT NULL,
  `use_use` varchar(255) DEFAULT NULL COMMENT '账号',
  `use_password` varchar(255) DEFAULT NULL,
  `use_cre_tim` date DEFAULT NULL,
  `use_order` varchar(255) DEFAULT NULL COMMENT '订单',
  PRIMARY KEY (`use_id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_use
-- ----------------------------
INSERT INTO `sys_use` VALUES ('1', '赵', '13214569', '1', '12', null, null, null, null, null);
INSERT INTO `sys_use` VALUES ('2', '李四', '321654', '2', '21', null, null, null, null, null);
INSERT INTO `sys_use` VALUES ('3', '王五', '456644', '2', '54', null, null, null, null, null);
INSERT INTO `sys_use` VALUES ('4', '赵', '13214569', '1', null, null, null, null, null, null);
INSERT INTO `sys_use` VALUES ('5', '李四', null, null, null, null, null, null, null, null);
INSERT INTO `sys_use` VALUES ('6', '李四', null, null, null, null, null, null, null, null);
INSERT INTO `sys_use` VALUES ('7', '李四', null, null, null, null, null, null, null, null);
INSERT INTO `sys_use` VALUES ('8', '李四', null, null, null, null, null, null, null, null);
INSERT INTO `sys_use` VALUES ('9', '李四', null, null, null, null, null, null, null, null);
INSERT INTO `sys_use` VALUES ('10', '李四', null, null, null, null, null, null, null, null);
INSERT INTO `sys_use` VALUES ('11', '李四', null, null, null, null, null, null, null, null);
INSERT INTO `sys_use` VALUES ('12', '李四', null, null, null, null, null, null, null, null);
