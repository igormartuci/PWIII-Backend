package fastmoving.tcc.FastMoving.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fastmoving.tcc.FastMoving.models.Cartao;

public interface CartaoDAO extends JpaRepository<Cartao, Integer>
{
}
