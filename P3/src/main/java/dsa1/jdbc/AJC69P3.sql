/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  cop4856
 * Created: Nov 20, 2019
 */

CREATE DATABASE AJC69;
USE AJC69;
DROP TABLE IF EXISTS PlaylistAJC69;

CREATE TABLE IF NOT EXISTS PlaylistAJC69
(
title varchar(148) NOT NULL,
director varchar(148) NOT NULL,
year int,
imdbRef varchar(30) NOT NULL PRIMARY KEY,
metascore int,
rottenTomatoes int,
keywords1 varchar(40),
keywords2 varchar(40),
keywords3 varchar(40),
keywords4 varchar(40),
keywords5 varchar(40)
);

INSERT INTO PlaylistAJC69 (title, director, year, imdbRef, metascore, rottenTomatoes, keywords1, keywords2, keywords3)
VALUES ('Shrek', 'Andrew Adamson', 2001,'tt0126029', 84, 88, 'donkey', 'ogre', 'swamp');

INSERT INTO PlaylistAJC69 (title, director, year, imdbRef, metascore, rottenTomatoes, keywords1, keywords2, keywords3, keywords4)
VALUES ('Iron Giant', 'Brad Bird', 1999,'tt0129167', 85, 96, 'robot', 'friendship', 'government', 'secret');

INSERT INTO PlaylistAJC69 (title, director, year, imdbRef, metascore, rottenTomatoes, keywords1, keywords2, keywords3, keywords4, keywords5)
VALUES ('A Goofy Movie', 'Kevin Lima', 1995,'tt0113198', 100, 88, 'father', 'son', 'relationship', 'travel', 'concert');

