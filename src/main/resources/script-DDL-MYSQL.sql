CREATE DATABASE smartphone_db;

use smartphone_db;

CREATE TABLE smartphone_db.tb_smartphone (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  marca VARCHAR(100) NOT NULL,
  modelo VARCHAR(100) NOT NULL,
  preco DECIMAL(15,2) NOT NULL,
  PRIMARY KEY (id)
)
ENGINE = InnoDB;
