/*
Navicat MySQL Data Transfer

Source Server         : 腾讯云
Source Server Version : 50718
Source Host           : 115.159.44.234:3306
Source Database       : jnshu

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-05-16 14:24:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for entry_form
-- ----------------------------
DROP TABLE IF EXISTS `entry_form`;
CREATE TABLE `entry_form` (
  `ID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `create_at` bigint(20) NOT NULL,
  `update_at` bigint(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `qq` varchar(15) NOT NULL,
  `profession` varchar(20) NOT NULL,
  `join_date` bigint(20) NOT NULL,
  `school` varchar(50) NOT NULL,
  `online_id` varchar(20) NOT NULL,
  `daily_url` text NOT NULL,
  `declaration` text NOT NULL,
  `introducer` varchar(20) NOT NULL,
  `referee` varchar(20) NOT NULL,
  `counselor` varchar(20) NOT NULL,
  `description` text NOT NULL,
  `city` varchar(10) NOT NULL,
  `review` varchar(10) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `name` (`name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of entry_form
-- ----------------------------
INSERT INTO `entry_form` VALUES ('2', '1492957343000', '1493126409000', '张三', '15044774768', 'JAVA工程师', '1491753600000', '内蒙古电子信息职业技术学院', '1485', 'http://www.jnshu.com/daily/18132?uid=10224', '老大最帅', '', '', '', '从知乎暗灭了解 到的修真院\n\n来的目的：打好编程基础，锻炼编程效率，思维。', '北京', '待审核');
INSERT INTO `entry_form` VALUES ('3', '1492957343000', '1493126411000', '李四', '15044774769', 'JAVA工程师', '1491753600000', '内蒙古电子信息职业技术学院', '1486', 'http://www.jnshu.com/daily/18132?uid=10224', '如果我不能在IT 特训营拼尽全力，为自己以后的修行路上打好基础，就让我永远追不到喜欢的人，给不了她想要的生活！', '', '', '', '从知乎暗灭了解 到的修真院\n\n来的目的：打好编程基础，锻炼编程效率，思维。', '北京', '待审核');
INSERT INTO `entry_form` VALUES ('4', '1492957343000', '1493126413000', '王五', '15044774766', 'JAVA工程师', '1491753600000', '内蒙古电子信息职业技术学院', '1487', 'http://www.jnshu.com/daily/18132?uid=10224', '如果我不能在IT 特训营拼尽全力，为自己以后的修行路上打好基础，就让我永远追不到喜欢的人，给不了她想要的生活！', '', '', '', '从知乎暗灭了解 到的修真院\n\n来的目的：打好编程基础，锻炼编程效率，思维。', '北京', '待审核');
INSERT INTO `entry_form` VALUES ('5', '1492958434000', '1493126416000', '陈小六', '15044774771', 'JAVA工程师', '1491753600000', '内蒙古电子信息职业技术学院', '1488', 'http://www.jnshu.com/daily/18132?uid=10224', '如果我不能在IT 特训营拼尽全力，为自己以后的修行路上打好基础，就让我永远追不到喜欢的人，给不了她想要的生活！', '', '', '', '从知乎暗灭了解 到的修真院\n\n来的目的：打好编程基础，锻炼编程效率，思维。', '北京', '待审核');
INSERT INTO `entry_form` VALUES ('6', '1492958465000', '1493126418000', '刘大七', '15044774782', 'JAVA工程师', '1491753600000', '内蒙古电子信息职业技术学院', '1489', 'http://www.jnshu.com/daily/18132?uid=10224', '如果我不能在IT 特训营拼尽全力，为自己以后的修行路上打好基础，就让我永远追不到喜欢的人，给不了她想要的生活！', '', '', '', '从知乎暗灭了解 到的修真院\n\n来的目的：打好编程基础，锻炼编程效率，思维。', '北京', '待审核');
INSERT INTO `entry_form` VALUES ('7', '1492958486000', '1493126421000', '杜小八', '15044774753', 'JAVA工程师', '1491753600000', '内蒙古电子信息职业技术学院', '1490', 'http://www.jnshu.com/daily/18132?uid=10224', '如果我不能在IT 特训营拼尽全力，为自己以后的修行路上打好基础，就让我永远追不到喜欢的人，给不了她想要的生活！', '', '', '', '从知乎暗灭了解 到的修真院\n\n来的目的：打好编程基础，锻炼编程效率，思维。', '北京', '待审核');
INSERT INTO `entry_form` VALUES ('8', '1492958505000', '1493126432000', '黄中九', '15044774724', 'JAVA工程师', '1491753600000', '内蒙古电子信息职业技术学院', '1491', 'http://www.jnshu.com/daily/18132?uid=10224', '如果我不能在IT 特训营拼尽全力，为自己以后的修行路上打好基础，就让我永远追不到喜欢的人，给不了她想要的生活！', '', '', '', '从知乎暗灭了解 到的修真院\n\n来的目的：打好编程基础，锻炼编程效率，思维。', '北京', '待审核');
INSERT INTO `entry_form` VALUES ('9', '1492958524000', '1493126430000', '石全十', '15044774709', 'JAVA工程师', '1491753600000', '内蒙古电子信息职业技术学院', '1492', 'http://www.jnshu.com/daily/18132?uid=10224', '如果我不能在IT 特训营拼尽全力，为自己以后的修行路上打好基础，就让我永远追不到喜欢的人，给不了她想要的生活！', '', '', '', '从知乎暗灭了解 到的修真院\n\n来的目的：打好编程基础，锻炼编程效率，思维。', '北京', '待审核');
INSERT INTO `entry_form` VALUES ('10', '1492958541000', '1493126435000', '楚十一', '15044774732', 'JAVA工程师', '1491753600000', '内蒙古电子信息职业技术学院', '1493', 'http://www.jnshu.com/daily/18132?uid=10224', '如果我不能在IT 特训营拼尽全力，为自己以后的修行路上打好基础，就让我永远追不到喜欢的人，给不了她想要的生活！', '', '', '', '从知乎暗灭了解 到的修真院\n\n来的目的：打好编程基础，锻炼编程效率，思维。', '北京', '待审核');
INSERT INTO `entry_form` VALUES ('11', '1493045000000', '1493126438000', '党翔', '15044774756', 'JAVA工程师', '1491753600000', '内蒙古电子信息职业技术学院', '1494', 'http://www.jnshu.com/daily/18132?uid=10224', '如果我不能在IT 特训营拼尽全力，为自己以后的修行路上打好基础，就让我永远追不到喜欢的人，给不了她想要的生活！', '', '', '', '从知乎暗灭了解 到的修真院\n\n来的目的：打好编程基础，锻炼编程效率，思维。', '北京', '待审核');
INSERT INTO `entry_form` VALUES ('30', '1494859831000', '1494859831000', '苏十六', '407', '哈哈', '1494682596000', '东软', '33', 'http: //www.haha.com', '', '', '', '', '无奈', '北京', '未审核');
INSERT INTO `entry_form` VALUES ('31', '1494859974000', '1494859974000', '苏十六', '407', '哈哈', '1494682596000', '东软', '33', 'http: //www.haha.com', '', '', '', '', '无奈', '北京', '未审核');
INSERT INTO `entry_form` VALUES ('32', '1494860292000', '1494860292000', '苏十六', '407', '哈哈', '1494682596000', '东软', '33', 'http: //www.haha.com', '', '', '', '', '无奈', '北京', '未审核');
INSERT INTO `entry_form` VALUES ('33', '1494890194000', '1494890194000', '苏十六', '407', '哈哈', '1494682596000', '东软', '33', 'http: //www.haha.com', '', '', '', '', '无奈', '北京', '未审核');
DROP TRIGGER IF EXISTS `create`;
DELIMITER ;;
CREATE TRIGGER `create` BEFORE INSERT ON `entry_form` FOR EACH ROW begin
    set new.create_at=UNIX_TIMESTAMP(now())*1000;
    set new.update_at=new.create_at;
end
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `update`;
DELIMITER ;;
CREATE TRIGGER `update` BEFORE UPDATE ON `entry_form` FOR EACH ROW begin
    set new.update_at=UNIX_TIMESTAMP(now())*1000;
end
;;
DELIMITER ;
