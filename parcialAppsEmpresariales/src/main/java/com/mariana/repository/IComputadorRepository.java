package com.mariana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariana.models.Computador;

public interface IComputadorRepository extends JpaRepository<Computador,Long>{

}
