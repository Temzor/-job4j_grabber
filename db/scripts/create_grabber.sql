CREATE TABLE "public"."post" (
  "id" int4 NOT NULL DEFAULT nextval('post_id_seq'::regclass),
  "name" varchar(255) COLLATE "pg_catalog"."default" NOT NULL,
  "text" text COLLATE "pg_catalog"."default" NOT NULL,
  "link" varchar(255) COLLATE "pg_catalog"."default" NOT NULL,
  "created" timestamp(6),
  CONSTRAINT "post_pkey" PRIMARY KEY ("id"),
  CONSTRAINT "post_link_key" UNIQUE ("link")
);