--
-- PostgreSQL database dump
--

-- Dumped from database version 14.1
-- Dumped by pg_dump version 14.1

-- Started on 2021-12-13 09:47:33

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 209 (class 1259 OID 16395)
-- Name: mascotas; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.mascotas (
    idmascota integer NOT NULL,
    nombre character varying(45),
    razon character varying(45),
    raza character varying(45),
    id integer
);


ALTER TABLE public.mascotas OWNER TO postgres;

--
-- TOC entry 210 (class 1259 OID 16400)
-- Name: mascotas_idmascota_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.mascotas ALTER COLUMN idmascota ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.mascotas_idmascota_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    MAXVALUE 100
    CACHE 1
);


--
-- TOC entry 3305 (class 0 OID 16395)
-- Dependencies: 209
-- Data for Name: mascotas; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.mascotas (idmascota, nombre, razon, raza, id) FROM stdin;
\.


--
-- TOC entry 3312 (class 0 OID 0)
-- Dependencies: 210
-- Name: mascotas_idmascota_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.mascotas_idmascota_seq', 9, true);


--
-- TOC entry 3165 (class 2606 OID 16399)
-- Name: mascotas mascotas_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.mascotas
    ADD CONSTRAINT mascotas_pkey PRIMARY KEY (idmascota);


-- Completed on 2021-12-13 09:47:33

--
-- PostgreSQL database dump complete
--

