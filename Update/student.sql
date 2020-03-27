/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : localhost:3306
 Source Schema         : student

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 24/03/2020 20:21:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for grade
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade`  (
  `学号` bigint(255) NOT NULL AUTO_INCREMENT,
  `姓名` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `性别` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `身份` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `所在学院` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `所在班级` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `户籍所在地` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`学号`, `姓名`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2019 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of grade
-- ----------------------------
INSERT INTO `grade` VALUES (101, '熊大', '男', '教师', '医学院', '临床医学1班', '北京');
INSERT INTO `grade` VALUES (102, '熊二', '男', '管理员', NULL, NULL, '湖北武汉');
INSERT INTO `grade` VALUES (2015, '鹤', '男', '学生', '计算机学院', '软件工程班', '陕西西安');
INSERT INTO `grade` VALUES (2017, '松', '女', '学生', '计算机学院', '卓越班', '新疆石河子');
INSERT INTO `grade` VALUES (2018, '燕', '女', '学生', '外国语学院', '阿拉伯语班', '四川成都');

-- ----------------------------
-- Table structure for health
-- ----------------------------
DROP TABLE IF EXISTS `health`;
CREATE TABLE `health`  (
  `学号` bigint(255) NOT NULL AUTO_INCREMENT,
  `姓名` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `当前体温` float(255, 0) NULL DEFAULT NULL,
  `健康状况是否良好` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `是否进行疫情上报` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `出发日期` datetime(6) NULL DEFAULT NULL,
  `出发地` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `目的地` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`学号`, `姓名`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2018 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of health
-- ----------------------------
INSERT INTO `health` VALUES (101, '熊大', 38, '否', '否', '2020-03-17 19:52:29.000000', '兰州', '北京');
INSERT INTO `health` VALUES (102, '熊二', 37, '是', '是', '2020-03-20 19:52:34.000000', '武汉', '兰州');
INSERT INTO `health` VALUES (105, '马', 36, '是', '是', '2020-03-17 19:54:57.000000', '兰州', '石河子');
INSERT INTO `health` VALUES (2011, '刘', 36, '是', '否', '2020-03-20 19:52:38.000000', '上海', '兰州');
INSERT INTO `health` VALUES (2017, '松', 36, '是', '否', '2020-03-15 19:45:24.000000', '石河子', '兰州');

-- ----------------------------
-- Table structure for login
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login`  (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of login
-- ----------------------------
INSERT INTO `login` VALUES ('123', '123');
INSERT INTO `login` VALUES ('松', '123');
INSERT INTO `login` VALUES ('熊大', '123');

-- ----------------------------
-- Table structure for sign
-- ----------------------------
DROP TABLE IF EXISTS `sign`;
CREATE TABLE `sign`  (
  `序号` int(255) NOT NULL AUTO_INCREMENT,
  `学号` bigint(255) NULL DEFAULT NULL,
  `姓名` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `填报时间` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `所在地` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `是否为武汉籍学生` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `是否为湖北省（不含武汉）籍学生` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `是否与疫区人员接触过` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `是否在武汉` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `是否今日返校` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `是否为留校中国学生` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`序号`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sign
-- ----------------------------
INSERT INTO `sign` VALUES (1, 2017, '松', '2020-03-23 20:18:10', '新疆石河子', '否', '否', '否', '否', '否', '否');
INSERT INTO `sign` VALUES (2, 105, '马', '2020-03-22 20:19:08', '甘肃兰州', '否', '否', '否', '否', '否', '否');
INSERT INTO `sign` VALUES (3, 2011, '刘', '2020-03-24 20:21:19', '甘肃兰州', '否', '否', '否', '否', '否', '否');

-- ----------------------------
-- Table structure for stu
-- ----------------------------
DROP TABLE IF EXISTS `stu`;
CREATE TABLE `stu`  (
  `学号` bigint(255) NOT NULL AUTO_INCREMENT,
  `姓名` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `性别` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `年龄` tinyint(255) NULL DEFAULT NULL,
  `专业` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `年级` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`学号`, `姓名`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2018 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of stu
-- ----------------------------
INSERT INTO `stu` VALUES (101, '熊大', '男', 20, '临床医学', '大二');
INSERT INTO `stu` VALUES (102, '熊二', '男', 19, '电信', '大二');
INSERT INTO `stu` VALUES (103, '马', '女', 22, '建筑', '大三');
INSERT INTO `stu` VALUES (104, '陈大', '女', 20, '计算机', '大三');
INSERT INTO `stu` VALUES (105, '马', '男', 22, '计算机', '大三');
INSERT INTO `stu` VALUES (2011, '刘', '男', 20, '计算机', '大三');
INSERT INTO `stu` VALUES (2017, '松', '女', 20, '计算机', '大三');

SET FOREIGN_KEY_CHECKS = 1;
