# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table comment (
  id                        bigint not null,
  text                      varchar(255) not null,
  author_name               varchar(255) not null,
  constraint pk_comment primary key (id))
;

create table document (
  id                        bigint not null,
  author                    varchar(255) not null,
  kategorie                 varchar(255),
  dokument_name             varchar(255) not null,
  dokumenten_typ            varchar(255) not null,
  schluessel_woerter        varchar(255),
  locked                    boolean,
  constraint pk_document primary key (id))
;

create table usage (
  role                      integer not null,
  user_name                 varchar(255) not null,
  constraint ck_usage_role check (role in (0,1)))
;

create table user (
  _type                     integer(31) not null,
  name                      varchar(255) not null,
  password                  varchar(255),
  constraint pk_user primary key (name))
;

create table version (
  id                        bigint not null,
  number                    integer not null,
  date                      timestamp not null,
  author_name               varchar(255) not null,
  comment_id                bigint,
  constraint pk_version primary key (id))
;

create sequence comment_seq;

create sequence document_seq;

create sequence user_seq;

create sequence version_seq;

alter table comment add constraint fk_comment_author_1 foreign key (author_name) references user (name) on delete restrict on update restrict;
create index ix_comment_author_1 on comment (author_name);
alter table usage add constraint fk_usage_user_2 foreign key (user_name) references user (name) on delete restrict on update restrict;
create index ix_usage_user_2 on usage (user_name);
alter table version add constraint fk_version_author_3 foreign key (author_name) references user (name) on delete restrict on update restrict;
create index ix_version_author_3 on version (author_name);
alter table version add constraint fk_version_comment_4 foreign key (comment_id) references comment (id) on delete restrict on update restrict;
create index ix_version_comment_4 on version (comment_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists comment;

drop table if exists document;

drop table if exists usage;

drop table if exists user;

drop table if exists version;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists comment_seq;

drop sequence if exists document_seq;

drop sequence if exists user_seq;

drop sequence if exists version_seq;

