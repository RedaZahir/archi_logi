package client;

import builder.Builder;
import builder.EntityBuilder;
import entities.Entity;
import factory.Creator;
import factory.Factory;

public class ClientImp implements Client {
    EntityBuilder entityToBuild;
    Entity entity;
    Builder builder;
    Factory factory;
    Creator creator;

    public ClientImp() {
        builder.build(entityToBuild);
        creator.create(factory);
        entity.describe();
    }

    @Override
    public String describe() {
        return "ClientImp{" +
                "entityToBuild=" + entityToBuild +
                ", entity=" + entity +
                ", builder=" + builder +
                ", factory=" + factory +
                ", creator=" + creator +
                '}';
    }
}
