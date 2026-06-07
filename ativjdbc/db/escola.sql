SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

CREATE TABLE `alunos` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `idade` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `alunos` (`id`, `nome`, `idade`) VALUES
(1, 'Rodrigo Mouses', 20),
(2, 'Larissa Brito', 22),
(3, 'Felipe Irelands', 19);

ALTER TABLE `alunos`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `alunos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;