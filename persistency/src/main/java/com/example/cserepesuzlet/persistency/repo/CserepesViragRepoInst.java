package com.example.cserepesuzlet.persistency.repo;

import com.example.cserepesuzlet.persistency.model.CserepesVirag;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class CserepesViragRepoInst implements CserepesViragRepo {

    protected List<CserepesVirag> entities = new ArrayList<>();

    @Override
    public CserepesVirag save(CserepesVirag entity) {
        entities.add(entity);
        return entities.get(entities.size() - 1);
    }

    @Override
    public <S extends CserepesVirag> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<CserepesVirag> findById(String s) {
        Optional<CserepesVirag> cserepesOpt = Optional.ofNullable(entities.get(Integer.parseInt(s)));
        return cserepesOpt;
    }

    @Override
    public boolean existsById(String s) {
        try {
            entities.get(Integer.parseInt(s));
            return true;
        } catch ( IndexOutOfBoundsException e ) {
            return false;
        }
    }

    @Override
    public Iterable<CserepesVirag> findAll() {
        return entities;
    }

    @Override
    public Iterable<CserepesVirag> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {
        try {
            entities.remove(Integer.parseInt(s));
        } catch (IndexOutOfBoundsException e) {

        }
    }

    @Override
    public void delete(CserepesVirag entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends CserepesVirag> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
