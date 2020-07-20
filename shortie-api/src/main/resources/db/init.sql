GRANT ALL PRIVILEGES ON DATABASE shortiedb TO shortie;

CREATE TABLE shortend_url (

    id            		SERIAL primary key,
    url_key           	varchar(10) NOT NULL,
    url           		varchar(80) NOT NULL,
    created_at      	TIMESTAMPTZ NOT NULL DEFAULT NOW()
);


INSERT INTO shortend_url (url_key, url ) VALUES ('mysu', 'www.su.com');
INSERT INTO shortend_url (url_key, url ) VALUES ('myjsu', 'www.jsu.com');
