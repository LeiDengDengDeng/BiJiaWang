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

 Date: 04/13/2017 23:09:34 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `comment`
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `commentID` int(11) NOT NULL,
  `userID` int(11) NOT NULL,
  `time` datetime NOT NULL,
  `content` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `goodID` int(11) NOT NULL,
  PRIMARY KEY (`commentID`),
  KEY `goodID` (`goodID`),
  KEY `userID` (`userID`) USING BTREE,
  CONSTRAINT `FKafsota64x3u9il1i4tqwfhkgh` FOREIGN KEY (`userID`) REFERENCES `user` (`userID`),
  CONSTRAINT `FKc8rw5dl8r0b65whr1uaextqok` FOREIGN KEY (`goodID`) REFERENCES `good` (`goodID`),
  CONSTRAINT `comment_ibfk_1` FOREIGN KEY (`userID`) REFERENCES `user` (`userID`),
  CONSTRAINT `comment_ibfk_2` FOREIGN KEY (`goodID`) REFERENCES `good` (`goodID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `good`
-- ----------------------------
DROP TABLE IF EXISTS `good`;
CREATE TABLE `good` (
  `goodID` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `url` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pictureSrc` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `detail` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `price` varchar(64) COLLATE utf8_unicode_ci DEFAULT '0',
  `commentCount` int(11) DEFAULT '0',
  `goodRate` double DEFAULT '0',
  `date` date DEFAULT NULL,
  PRIMARY KEY (`goodID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `goodshield`
-- ----------------------------
DROP TABLE IF EXISTS `goodshield`;
CREATE TABLE `goodshield` (
  `goodID` int(11) NOT NULL,
  PRIMARY KEY (`goodID`),
  CONSTRAINT `goodshield_ibfk_1` FOREIGN KEY (`goodID`) REFERENCES `good` (`goodID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `goodsorder`
-- ----------------------------
DROP TABLE IF EXISTS `goodsorder`;
CREATE TABLE `goodsorder` (
  `orderID` int(11) NOT NULL,
  `price` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `amount` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `userID` int(11) NOT NULL,
  `goodID` int(11) NOT NULL,
  `buytime` datetime DEFAULT NULL,
  PRIMARY KEY (`orderID`),
  KEY `goodsid` (`goodID`),
  KEY `userid` (`userID`),
  CONSTRAINT `FKgusrsshsai00slfw5i1s1wwe3` FOREIGN KEY (`goodID`) REFERENCES `good` (`goodID`),
  CONSTRAINT `FKi973tidds3eddqknfe96ik02v` FOREIGN KEY (`userID`) REFERENCES `user` (`userID`),
  CONSTRAINT `goodsorder_ibfk_1` FOREIGN KEY (`goodID`) REFERENCES `good` (`goodID`),
  CONSTRAINT `goodsorder_ibfk_2` FOREIGN KEY (`userID`) REFERENCES `user` (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `ipblacklist`
-- ----------------------------
DROP TABLE IF EXISTS `ipblacklist`;
CREATE TABLE `ipblacklist` (
  `ipaddress` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`ipaddress`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `iprecord`
-- ----------------------------
DROP TABLE IF EXISTS `iprecord`;
CREATE TABLE `iprecord` (
  `idaddress` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `times` int(11) DEFAULT '0',
  `totaltimes` int(11) DEFAULT '0',
  `lastvisittime` datetime DEFAULT NULL,
  PRIMARY KEY (`idaddress`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `sensitive`
-- ----------------------------
DROP TABLE IF EXISTS `sensitive`;
CREATE TABLE `sensitive` (
  `sensitiveWord` varchar(255) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `sensitive`
-- ----------------------------
BEGIN;
INSERT INTO `sensitive` VALUES ('去你妈', '1'), ('共产党', '2');
COMMIT;

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

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userID` int(11) NOT NULL,
  `userName` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `phone` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`userID`),
  KEY `userID` (`userID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Records of `user`
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('1', '管理员', '123', '', ''), ('2', '系统管理员', '123', '', ''), ('3', '小明', '123', '', '');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
