package org.example.behavioural.command;

import org.example.structurral.decorator.Product;

import java.awt.image.ImageProducer;

public interface Command {
    void execute(Product product);

    void undo(Product product);
}
