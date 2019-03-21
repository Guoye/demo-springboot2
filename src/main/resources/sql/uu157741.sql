/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost
 Source Database       : uu157742

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : utf-8

 Date: 03/21/2019 11:34:59 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `wp_users`
-- ----------------------------
DROP TABLE IF EXISTS `wp_users`;
CREATE TABLE `wp_users` (
  `ID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `user_login` varchar(60) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `user_pass` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `user_nicename` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `user_email` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `user_url` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `user_registered` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `user_activation_key` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `user_status` int(11) NOT NULL DEFAULT '0',
  `display_name` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  PRIMARY KEY (`ID`),
  KEY `user_login_key` (`user_login`),
  KEY `user_nicename` (`user_nicename`),
  KEY `user_email` (`user_email`)
) ENGINE=MyISAM AUTO_INCREMENT=145 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
--  Records of `wp_users`
-- ----------------------------
BEGIN;
INSERT INTO `wp_users` VALUES ('139', 'ScottyEnnis', '$P$BGtr6cXmTtyHjRXscPkEHTlkTd4FLW0', 'scottyennis', 'nosyglossary78lp26@outlook.com', '', '2013-11-27 19:49:32', '', '0', 'ScottyEnnis'), ('142', 'oH9kW5eB0k', 'null', 'scottyennis', 'nosyglossary78lp26@outlook.com', '', '2019-03-20 03:53:57', '', '0', 'ScottyEnnis2'), ('143', 'oZ2pC3tL7p', 'null', 'forum', '2.01.3j.ingu.iho.n.g.t.es.t@gmail.com', '', '2019-03-20 04:03:41', '', '0', 'ScottyEnnis3'), ('144', 'CliftonSouza', 'null', 'clouaymhy', 'sidneyPaytonAle5918@gmail.com', '', '2019-03-20 04:20:44', '', '0', 'ScottyEnnis4');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
