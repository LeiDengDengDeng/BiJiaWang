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

 Date: 03/26/2017 19:12:46 PM
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
  `content` varchar(255) NOT NULL,
  `goodID` int(11) NOT NULL,
  PRIMARY KEY (`commentID`),
  KEY `goodID` (`goodID`),
  KEY `userID` (`userID`) USING BTREE,
  CONSTRAINT `FKafsota64x3u9il1i4tqwfhkgh` FOREIGN KEY (`userID`) REFERENCES `user` (`userID`),
  CONSTRAINT `FKc8rw5dl8r0b65whr1uaextqok` FOREIGN KEY (`goodID`) REFERENCES `good` (`goodID`),
  CONSTRAINT `comment_ibfk_1` FOREIGN KEY (`userID`) REFERENCES `user` (`userID`),
  CONSTRAINT `comment_ibfk_2` FOREIGN KEY (`goodID`) REFERENCES `good` (`goodID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `good`
-- ----------------------------
DROP TABLE IF EXISTS `good`;
CREATE TABLE `good` (
  `goodID` int(11) NOT NULL,
  `goodName` varchar(50) NOT NULL,
  `goodPrice` double NOT NULL,
  `goodStoreName` varchar(50) NOT NULL,
  `goodStoreHref` varchar(50) NOT NULL,
  `type` varchar(50) NOT NULL,
  `brand` varchar(50) NOT NULL,
  `description` varchar(255) NOT NULL,
  PRIMARY KEY (`goodID`),
  KEY `goodID` (`goodID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `goodshield`
-- ----------------------------
DROP TABLE IF EXISTS `goodshield`;
CREATE TABLE `goodshield` (
  `goodID` int(11) NOT NULL,
  PRIMARY KEY (`goodID`),
  CONSTRAINT `goodshield_ibfk_1` FOREIGN KEY (`goodID`) REFERENCES `good` (`goodID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `goodsorder`
-- ----------------------------
DROP TABLE IF EXISTS `goodsorder`;
CREATE TABLE `goodsorder` (
  `orderID` int(11) NOT NULL,
  `price` varchar(45) NOT NULL,
  `amount` varchar(45) NOT NULL,
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ipblacklist`
-- ----------------------------
DROP TABLE IF EXISTS `ipblacklist`;
CREATE TABLE `ipblacklist` (
  `ipaddress` varchar(45) NOT NULL,
  PRIMARY KEY (`ipaddress`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `iprecord`
-- ----------------------------
DROP TABLE IF EXISTS `iprecord`;
CREATE TABLE `iprecord` (
  `idaddress` varchar(45) NOT NULL,
  `times` int(11) DEFAULT '0',
  `totaltimes` int(11) DEFAULT '0',
  `lastvisittime` datetime DEFAULT NULL,
  PRIMARY KEY (`idaddress`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userID` int(11) NOT NULL,
  `userName` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone` varchar(50) NOT NULL,
  PRIMARY KEY (`userID`),
  KEY `userID` (`userID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

SET FOREIGN_KEY_CHECKS = 1;
