package org.apache.zeppelin.filecp;

import org.apache.zeppelin.interpreter.Interpreter;
import org.apache.zeppelin.interpreter.InterpreterContext;
import org.apache.zeppelin.interpreter.InterpreterException;
import org.apache.zeppelin.interpreter.InterpreterResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public class CustomInterpreter extends Interpreter {
    public CustomInterpreter(Properties properties) {
        super(properties);
        Logger logger = LoggerFactory.getLogger(CustomInterpreter.class);
    }

    @Override
    public void open() throws InterpreterException {
        System.out.println("open");
    }

    @Override
    public void close() throws InterpreterException {
        System.out.println("close");
    }

    @Override
    public InterpreterResult interpret(String st, InterpreterContext context) throws InterpreterException {
        System.out.println("interpret");
        return null;
    }

    @Override
    public void cancel(InterpreterContext context) throws InterpreterException {
        System.out.println("cancel");
    }

    @Override
    public FormType getFormType() throws InterpreterException {
        return null;
    }

    @Override
    public int getProgress(InterpreterContext context) throws InterpreterException {
        return 0;
    }
}
