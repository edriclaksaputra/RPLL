-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 18 Apr 2017 pada 04.22
-- Versi Server: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `parkir`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
`id` int(20) NOT NULL,
  `name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `daftarparkir`
--

CREATE TABLE IF NOT EXISTS `daftarparkir` (
  `idUser` varchar(20) NOT NULL,
  `noKend` varchar(10) NOT NULL,
  `startTime` date NOT NULL,
`idParkirMasuk` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `mobil`
--

CREATE TABLE IF NOT EXISTS `mobil` (
  `noKendaraan` varchar(20) NOT NULL,
  `rfid` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `retailer`
--

CREATE TABLE IF NOT EXISTS `retailer` (
`id` int(20) NOT NULL,
  `companyName` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE IF NOT EXISTS `transaksi` (
  `date` date NOT NULL,
  `noKendaraan` varchar(20) NOT NULL,
  `noParkir` varchar(20) NOT NULL,
  `bill` int(20) NOT NULL,
  `startTime` time NOT NULL,
  `endTime` time NOT NULL,
  `statusTrasaksi` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `rfid` varchar(20) NOT NULL,
  `saldo` int(20) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `statusKartu` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `daftarparkir`
--
ALTER TABLE `daftarparkir`
 ADD PRIMARY KEY (`idParkirMasuk`);

--
-- Indexes for table `mobil`
--
ALTER TABLE `mobil`
 ADD PRIMARY KEY (`noKendaraan`), ADD KEY `rfid` (`rfid`);

--
-- Indexes for table `retailer`
--
ALTER TABLE `retailer`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
 ADD PRIMARY KEY (`date`), ADD KEY `noKendaraan` (`noKendaraan`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
 ADD PRIMARY KEY (`rfid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
MODIFY `id` int(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `daftarparkir`
--
ALTER TABLE `daftarparkir`
MODIFY `idParkirMasuk` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `retailer`
--
ALTER TABLE `retailer`
MODIFY `id` int(20) NOT NULL AUTO_INCREMENT;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `mobil`
--
ALTER TABLE `mobil`
ADD CONSTRAINT `rfid_constraint` FOREIGN KEY (`rfid`) REFERENCES `user` (`rfid`);

--
-- Ketidakleluasaan untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
ADD CONSTRAINT `noKendaraan_constraint` FOREIGN KEY (`noKendaraan`) REFERENCES `mobil` (`noKendaraan`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
