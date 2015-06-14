-- Table: "Balance"

-- DROP TABLE "Balance";

CREATE TABLE "Balance"
(
  id serial NOT NULL,
  deposit_id integer,
  from_date date,
  to_date date,
  balance bigint,
  CONSTRAINT balance_pk PRIMARY KEY (id),
  CONSTRAINT balance_deposit_fk FOREIGN KEY (deposit_id)
      REFERENCES "Deposit" (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Balance"
  OWNER TO postgres;

  
  -- Table: "Currency"

-- DROP TABLE "Currency";

CREATE TABLE "Currency"
(
  id serial NOT NULL,
  descr text NOT NULL,
  CONSTRAINT currency_pk PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Currency"
  OWNER TO postgres;

  
  -- Table: "Deposit"

-- DROP TABLE "Deposit";

CREATE TABLE "Deposit"
(
  id serial NOT NULL,
  currency_id integer,
  start_date date,
  end_date date,
  term_id integer,
  fix_term_id integer,
  fix_term_end_date date,
  bank_id integer,
  branch_id integer,
  capitalization_frequency_id integer,
  auto_renewal_count integer,
  CONSTRAINT deposit_pk PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Deposit"
  OWNER TO postgres;

  
  -- Table: "Rate"

-- DROP TABLE "Rate";

CREATE TABLE "Rate"
(
  id serial NOT NULL,
  deposit_id integer,
  from_date date,
  to_date date,
  rate real,
  CONSTRAINT rate_pk PRIMARY KEY (id),
  CONSTRAINT rate_deposit_fk FOREIGN KEY (deposit_id)
      REFERENCES "Deposit" (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Rate"
  OWNER TO postgres;

  
  -- Table: "Term"

-- DROP TABLE "Term";

CREATE TABLE "Term"
(
  id serial NOT NULL,
  descr text,
  days_count integer,
  months_count integer,
  years_count integer,
  CONSTRAINT term_pk PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Term"
  OWNER TO postgres;
