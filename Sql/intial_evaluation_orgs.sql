create table if not exists intial_evaluation_orgs(
initial_evaluation_org_code bigint not null,
initial_evaluation_org_name varchar(255) null,
initial_evaluation_org_desc varchar(255) null,
remarks varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint initial_evaluation_orgs_pk primary key(initial_evaluation_org_code));