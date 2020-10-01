
 DROP TABLE IF EXISTS grafos;

CREATE TABLE grafos (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  distancia int DEFAULT NULL
);

 DROP TABLE IF EXISTS grafos_details;

CREATE TABLE grafos_details (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  distancia int DEFAULT NULL,
  origem varchar(200) DEFAULT NULL,
  destino varchar(200) DEFAULT NULL,
  grafo_id bigint not null,
  CONSTRAINT FK_GRAFOOS FOREIGN KEY (grafo_id) REFERENCES grafos (id)

);
