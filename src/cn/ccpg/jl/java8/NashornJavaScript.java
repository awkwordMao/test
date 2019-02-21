package cn.ccpg.jl.java8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornJavaScript {

    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        try {
            Object result = engine.eval("function f(){return 1;};" +
                    "f() + 1;");
            System.out.println(result);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
