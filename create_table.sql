/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Hanif
 * Created: Dec 19, 2023
 */

CREATE TABLE jenis_kelamin (
    id   INTEGER PRIMARY KEY AUTO_INCREMENT,
    nama VARCHAR(32) UNIQUE NOT NULL
);

CREATE TABLE kendaraan (
    id      INTEGER PRIMARY KEY AUTO_INCREMENT,
    nopol   VARCHAR(15) UNIQUE NOT NULL,
    warna   VARCHAR(20) NOT NULL,
    tipe_id INTEGER NOT NULL
);

CREATE TABLE parkir (
    no_tiket     INTEGER PRIMARY KEY AUTO_INCREMENT,
    waktu_masuk  DATETIME NOT NULL,
    waktu_keluar DATETIME,
    biaya_parkir INTEGER,
    biaya_denda  INTEGER,
    total_biaya  INTEGER,
    kendaraan_id INTEGER NOT NULL,
    pegawai_uid  CHAR(32) NOT NULL
);

CREATE TABLE pegawai (
    uid              CHAR(32) PRIMARY KEY,
    id               VARCHAR(64) UNIQUE NOT NULL,
    sandi            CHAR(32) NOT NULL,
    nama             VARCHAR(254) NOT NULL,
    no_telp          VARCHAR(15) UNIQUE NOT NULL,
    alamat           TEXT NOT NULL,
    jenis_kelamin_id INTEGER NOT NULL
);

CREATE TABLE tipe (
    id           INTEGER PRIMARY KEY AUTO_INCREMENT,
    nama         VARCHAR(254) UNIQUE NOT NULL,
    tarif_awal   INTEGER NOT NULL,
    tarif_perjam INTEGER NOT NULL
);

ALTER TABLE kendaraan
    ADD CONSTRAINT kendaraan_tipe_fk FOREIGN KEY ( tipe_id )
        REFERENCES tipe ( id );

ALTER TABLE parkir
    ADD CONSTRAINT parkir_kendaraan_fk FOREIGN KEY ( kendaraan_id )
        REFERENCES kendaraan ( id );

ALTER TABLE parkir
    ADD CONSTRAINT parkir_pegawai_fk FOREIGN KEY ( pegawai_uid )
        REFERENCES pegawai ( uid );

ALTER TABLE pegawai
    ADD CONSTRAINT pegawai_jenis_kelamin_fk FOREIGN KEY ( jenis_kelamin_id )
        REFERENCES jenis_kelamin ( id );