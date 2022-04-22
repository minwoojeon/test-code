-- created by minwoo@marvrus.com
drop database projectb;
create database projectb default charset=utf8mb4 collate utf8mb4_unicode_ci;
use projectb;

delete from mysql.user where User ='projectb';
delete from mysql.db where User ='projectb';
flush privileges;

CREATE user 'projectb'@'localhost' IDENTIFIED BY '1q2w3e4r';
CREATE user 'projectb'@'%' IDENTIFIED BY '1q2w3e4r';
GRANT ALL PRIVILEGES ON projectb.* TO 'projectb'@'localhost';
GRANT ALL PRIVILEGES ON projectb.* TO 'projectb'@'%';
flush privileges;

DROP TABLE IF EXISTS `USER`;

CREATE TABLE `USER` (
	`ID`	BIGINT	NOT NULL	auto_increment	COMMENT '회원 일련번호' PRIMARY KEY,
	`NAME`	VARCHAR(100)	NOT NULL	COMMENT '이름',
	`PASSWORD`	VARCHAR(512)	NOT NULL	COMMENT '비밀번호',
	`DELETE_YN`	INT	NOT NULL	DEFAULT 0	COMMENT '삭제 여부',
	`CREATE_DT`	DATETIME	NOT NULL	 	COMMENT '가입일자',
	`UPDATE_DT`	DATETIME	NOT NULL	 	COMMENT '수정일자'
) COMMENT='user' DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;

DROP TABLE IF EXISTS `BOARD`;

CREATE TABLE `BOARD` (
	`ID`	BIGINT	NOT NULL	auto_increment PRIMARY KEY,
	`USER_ID`	BIGINT	NOT NULL	COMMENT '회원 일련번호',
	`CONTEXT`	TEXT	NOT NULL	COMMENT '내용',
	`VISIBLE`	INT	NOT NULL	DEFAULT 0	COMMENT '노출 여부',
	`CREATE_DT`	DATETIME	NOT NULL	 	COMMENT '작성일시',
	`UPDATE_DT`	DATETIME	NOT NULL	 	COMMENT '수정일자'
) COMMENT='board' DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
