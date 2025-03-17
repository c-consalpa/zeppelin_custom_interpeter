package io.arenadata.zeppelin.mycustominterpreter;

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
        logger.info("open");
    }

    @Override
    public void close() throws InterpreterException {
        logger.info("close()");
    }

    @Override
    public InterpreterResult interpret(String st, InterpreterContext context) throws InterpreterException {
        logger.info("interpret()");
        return null;
    }

    @Override
    public void cancel(InterpreterContext context) throws InterpreterException {
        logger.info("cancel()");
    }

    @Override
    public FormType getFormType() throws InterpreterException {
        logger.info("getFormType()");
        return null;
    }

    @Override
    public int getProgress(InterpreterContext context) throws InterpreterException {
        logger.info("getProgress()");
        return 0;
    }
}