/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.produtos.apirest.repository;

import com.produtos.apirest.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Deivi
 */
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
    Produto findById(long id);
    
}
