/*
 Navicat Premium Data Transfer

 Source Server         : datadb
 Source Server Type    : MySQL
 Source Server Version : 80037
 Source Host           : localhost:3306
 Source Schema         : bookdb

 Target Server Type    : MySQL
 Target Server Version : 80037
 File Encoding         : 65001

 Date: 18/05/2024 11:33:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for b_data
-- ----------------------------
DROP TABLE IF EXISTS `b_data`;
CREATE TABLE `b_data`  (
  `编号` int NOT NULL AUTO_INCREMENT COMMENT '未录入',
  `图书名称` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '未录入',
  `作者` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '未录入',
  `分类` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '未录入',
  `上架时间` int NULL DEFAULT NULL COMMENT '未录入',
  `出版社` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '未录入',
  `价格` decimal(10, 2) NULL DEFAULT NULL COMMENT '未录入',
  PRIMARY KEY (`编号`) USING BTREE,
  INDEX `LeiBie`(`分类` ASC) USING BTREE,
  CONSTRAINT `LeiBie` FOREIGN KEY (`分类`) REFERENCES `leibie` (`类别号`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of b_data
-- ----------------------------
INSERT INTO `b_data` VALUES (1, '人类星环向', '沃兹基', 'A', 1715754756, '鸿运', 90.00);
INSERT INTO `b_data` VALUES (2, '人类星环向', '沃兹基', 'A', 1715754756, '鸿运', 90.00);
INSERT INTO `b_data` VALUES (3, 'huaisd', 'sda', 'B', 1715754756, '鸿运2', 900.00);
INSERT INTO `b_data` VALUES (4, '人环向', 'ASD', 'D', 1715754756, 'ads', 230.00);
INSERT INTO `b_data` VALUES (5, '星环', '沃SAC', 'C', 1715754756, 'adfb', 440.00);
INSERT INTO `b_data` VALUES (6, '星向', '沃兹基WQ', 'A', 1715754756, 'asdkb', 130.00);
INSERT INTO `b_data` VALUES (7, '人星向', '沃兹基AHS', 'A', 1715754756, 'afh', 560.00);
INSERT INTO `b_data` VALUES (8, '人类', '沃ASD', 'B', 1715754756, 'quge', 780.00);
INSERT INTO `b_data` VALUES (9, '人星向', '沃ASD基', 'C', 1715754756, 'ad', 980.00);
INSERT INTO `b_data` VALUES (10, '人类WQR向', '沃KH', 'D', 1715754756, 'adh', 880.00);
INSERT INTO `b_data` VALUES (11, '人类星环向', 'JGH', 'B', 1715754756, 'mhb', 980.00);
INSERT INTO `b_data` VALUES (12, '人类星环向2', 'ASD', 'B', 1715754756, 'asdk', 340.00);
INSERT INTO `b_data` VALUES (13, '人DG', 'ASD', 'C', 1715754756, 'asdhk', 2310.00);
INSERT INTO `b_data` VALUES (14, 'ZDB向', 'ASD', 'D', 1715754756, 'akdj', 890.00);
INSERT INTO `b_data` VALUES (15, '人FFFFFFFF', 'DGB', 'A', 1715754756, 'sda', 34.00);
INSERT INTO `b_data` VALUES (16, '人2', 'GFB', 'D', 1715754756, 'as', 78.00);
INSERT INTO `b_data` VALUES (17, '人类星4', 'DGSF', 'B', 1715754756, 'jl', 45.00);
INSERT INTO `b_data` VALUES (18, '人55环向', '沃DSF', 'B', 1715754756, 'sad', 23.00);
INSERT INTO `b_data` VALUES (19, '人66向', 'ASDS兹基', 'A', 1715754756, 'ahds', 21.00);
INSERT INTO `b_data` VALUES (20, '人22向', '沃QQWE基', 'A', 1715754756, 'qis', 98.00);

-- ----------------------------
-- Table structure for leibie
-- ----------------------------
DROP TABLE IF EXISTS `leibie`;
CREATE TABLE `leibie`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `类别号` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT '',
  `真实类型` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `INDEXKEY`(`类别号` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of leibie
-- ----------------------------
INSERT INTO `leibie` VALUES (1, 'A', '生物类');
INSERT INTO `leibie` VALUES (2, 'B', '科技类');
INSERT INTO `leibie` VALUES (3, 'C', '娱乐类');
INSERT INTO `leibie` VALUES (4, 'D', '文艺');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int NOT NULL COMMENT 'AUTO_INCREMENT',
  `name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `passWord` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'wangjiahao', '1234567');

SET FOREIGN_KEY_CHECKS = 1;
