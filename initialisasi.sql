-- phpMyAdmin SQL Dump
-- version 5.1.1deb5ubuntu1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Dec 28, 2023 at 02:43 AM
-- Server version: 10.6.12-MariaDB-0ubuntu0.22.04.1
-- PHP Version: 8.1.2-1ubuntu2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `parkirin`
--

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

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

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`uuid`, `id`, `sandi`, `nama`, `gender`, `telp`, `alamat`, `level`) VALUES
('1ac82eb3644ea8f3ef0b4e9322e59cba', 'admin', '21232f297a57a5a743894a0e4a801fc3', 'Default Admin', 'Laki - Laki', '-', '-', 'Admin');

-- --------------------------------------------------------

--
-- Table structure for table `pemarkiran`
--

CREATE TABLE `pemarkiran` (
  `no` int(11) NOT NULL,
  `nopol` varchar(15) NOT NULL,
  `jenis` int(11) NOT NULL,
  `masuk` datetime NOT NULL,
  `keluar` datetime DEFAULT NULL,
  `status` enum('Normal','Bayar Denda') DEFAULT NULL,
  `biaya` int(11) DEFAULT NULL,
  `pegawai` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tarif`
--

CREATE TABLE `tarif` (
  `id` int(11) NOT NULL,
  `jenis` varchar(120) NOT NULL,
  `hari_pertama` int(11) NOT NULL,
  `per_jam` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`uuid`),
  ADD UNIQUE KEY `nomor_pegawai` (`id`(64));

--
-- Indexes for table `pemarkiran`
--
ALTER TABLE `pemarkiran`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `tarif`
--
ALTER TABLE `tarif`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pemarkiran`
--
ALTER TABLE `pemarkiran`
  MODIFY `no` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tarif`
--
ALTER TABLE `tarif`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;