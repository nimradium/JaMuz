BEGIN TRANSACTION;
insert into "optiontype" ("idOptionType", "name", "default", "type") values ('1', 'location.library', '', 'path');
insert into "optiontype" ("idOptionType", "name", "default", "type") values ('2', 'library.isMaster', 'false', 'bool');
insert into "optiontype" ("idOptionType", "name", "default", "type") values ('3', 'location.add', '', 'path');
insert into "optiontype" ("idOptionType", "name", "default", "type") values ('4', 'location.ok', '', 'path');
insert into "optiontype" ("idOptionType", "name", "default", "type") values ('5', 'location.ko', '', 'path');
insert into "optiontype" ("idOptionType", "name", "default", "type") values ('6', 'network.proxy', '', 'proxy');
insert into "optiontype" ("idOptionType", "name", "default", "type") values ('7', 'location.mask', '%albumartist%/%album%/%track% %title%', 'mask');
insert into "optiontype" ("idOptionType", "name", "default", "type") values ('8', 'log.level', 'INFO', 'list');
insert into "optiontype" ("idOptionType", "name", "default", "type") values ('9', 'log.limit', '5242880', 'integer');
insert into "optiontype" ("idOptionType", "name", "default", "type") values ('10', 'log.count', '20', 'integer');
insert into "optiontype" ("idOptionType", "name", "default", "type") values ('11', 'files.audio', 'mp3,flac', 'csv');
insert into "optiontype" ("idOptionType", "name", "default", "type") values ('12', 'files.image', 'png,jpg,jpeg,bmp,gif', 'csv');
insert into "optiontype" ("idOptionType", "name", "default", "type") values ('13', 'files.convert', 'wma:mp3,ogg:mp3,m4a:mp3,mpc:mp3', 'csv');
insert into "optiontype" ("idOptionType", "name", "default", "type") values ('14', 'files.delete', 'db,ini,txt,m3u,pls,htm,html,doc,nfo,url', 'csv');
insert into "optiontype" ("idOptionType", "name", "default", "type") values ('15', 'location.manual', '', 'path');
COMMIT;