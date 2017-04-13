/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50505
 Source Host           : localhost
 Source Database       : biJiangWang

 Target Server Type    : MySQL
 Target Server Version : 50505
 File Encoding         : utf-8

 Date: 04/13/2017 22:20:51 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `synonyms`
-- ----------------------------
DROP TABLE IF EXISTS `synonyms`;
CREATE TABLE `synonyms` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `synonymsWord` varchar(255) NOT NULL,
  `groupid` int(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `synonyms`
-- ----------------------------
BEGIN;
INSERT INTO `synonyms` VALUES ('1', 'iphone', '1'), ('2', 'iphone7', '1'), ('3', 'iphone7 plus', '1'), ('4', 'iphone6', '1'), ('5', 'iphone6s', '1');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
