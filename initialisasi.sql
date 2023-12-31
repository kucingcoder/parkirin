SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

CREATE TABLE `pegawai` (
  `uuid` char(32) NOT NULL,
  `id` varchar(120) NOT NULL,
  `sandi` char(32) NOT NULL,
  `nama` varchar(120) NOT NULL,
  `gender` enum('Laki - Laki','Perempuan') NOT NULL,
  `telp` char(13) NOT NULL,
  `alamat` text NOT NULL,
  `level` enum('Standar','Admin') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `pegawai` (`uuid`, `id`, `sandi`, `nama`, `gender`, `telp`, `alamat`, `level`) VALUES
('1ac82eb3644ea8f3ef0b4e9322e59cba', 'admin', '21232f297a57a5a743894a0e4a801fc3', 'Admin', 'Laki - Laki', '-', '-', 'Admin');

CREATE TABLE `pemarkiran` (
  `no` int(11) NOT NULL,
  `nopol` varchar(15) NOT NULL,
  `jenis` varchar(120) NOT NULL,
  `masuk` datetime NOT NULL,
  `keluar` datetime DEFAULT NULL,
  `status` enum('Normal','Bayar Denda') DEFAULT NULL,
  `total_biaya` int(11) DEFAULT NULL,
  `pegawai` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE `tarif` (
  `id` int(11) NOT NULL,
  `jenis` varchar(120) NOT NULL,
  `waktu_normal` int(11) NOT NULL,
  `biaya_normal` int(11) NOT NULL,
  `biaya_perjam` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`uuid`),
  ADD UNIQUE KEY `nomor_pegawai` (`id`(64));

ALTER TABLE `pemarkiran`
  ADD PRIMARY KEY (`no`);

ALTER TABLE `tarif`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `jenis` (`jenis`);

ALTER TABLE `pemarkiran`
  MODIFY `no` int(11) NOT NULL AUTO_INCREMENT;

ALTER TABLE `tarif`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;