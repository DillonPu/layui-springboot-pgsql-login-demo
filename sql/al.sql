PGDMP     &                    x         	   al    12.2    12.2     	           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            
           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16393 	   al    DATABASE     �   CREATE DATABASE al WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Chinese (Simplified)_China.936' LC_CTYPE = 'Chinese (Simplified)_China.936';
    DROP DATABASE al;
                postgres    false            �            1259    16394 	   demo_user    TABLE     �   CREATE TABLE public.demo_user (
    id integer NOT NULL,
    username character varying(255),
    userpwd character varying(255)
);
    DROP TABLE public.demo_user;
       public         heap    postgres    false                       0    0    COLUMN demo_user.id    COMMENT     3   COMMENT ON COLUMN public.demo_user.id IS '主键';
          public          postgres    false    202            �            1259    16402    demo_user_info    TABLE     �   CREATE TABLE public.demo_user_info (
    id integer NOT NULL,
    uid integer,
    age integer,
    province character varying(255),
    city character varying(255),
    gender smallint
);
 "   DROP TABLE public.demo_user_info;
       public         heap    postgres    false                       0    0    COLUMN demo_user_info.uid    COMMENT     ;   COMMENT ON COLUMN public.demo_user_info.uid IS '用户ID';
          public          postgres    false    203                       0    0    COLUMN demo_user_info.age    COMMENT     9   COMMENT ON COLUMN public.demo_user_info.age IS '年龄';
          public          postgres    false    203                       0    0    COLUMN demo_user_info.province    COMMENT     >   COMMENT ON COLUMN public.demo_user_info.province IS '省份';
          public          postgres    false    203                       0    0    COLUMN demo_user_info.city    COMMENT     =   COMMENT ON COLUMN public.demo_user_info.city IS '市区名';
          public          postgres    false    203                       0    0    COLUMN demo_user_info.gender    COMMENT     H   COMMENT ON COLUMN public.demo_user_info.gender IS '性别 1-女 2-男';
          public          postgres    false    203                      0    16394 	   demo_user 
   TABLE DATA           :   COPY public.demo_user (id, username, userpwd) FROM stdin;
    public          postgres    false    202                    0    16402    demo_user_info 
   TABLE DATA           N   COPY public.demo_user_info (id, uid, age, province, city, gender) FROM stdin;
    public          postgres    false    203   N       �
           2606    16409 "   demo_user_info demo_user_info_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public.demo_user_info
    ADD CONSTRAINT demo_user_info_pkey PRIMARY KEY (id);
 L   ALTER TABLE ONLY public.demo_user_info DROP CONSTRAINT demo_user_info_pkey;
       public            postgres    false    203            �
           2606    16401    demo_user demo_user_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.demo_user
    ADD CONSTRAINT demo_user_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.demo_user DROP CONSTRAINT demo_user_pkey;
       public            postgres    false    202                  x�3�LL�LJ�2щ�\�@����� bE%         P   x�3�4�44�|���tW�ӥ�/��8��8�Ѐ����Ov��|�}��9�9���9�(<{���s9�uLxټ�:F��� l��     