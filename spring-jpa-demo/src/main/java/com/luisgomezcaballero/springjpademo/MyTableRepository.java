package com.luisgomezcaballero.springjpademo;

import org.springframework.data.repository.CrudRepository;

public interface MyTableRepository extends CrudRepository<MyTable, Long> {
}
