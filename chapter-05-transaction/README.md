### 注意点

- org.springframework 都是基于 4.xx 版本的，最后保持org.springframework下的版本都一致
- 由于 4.xx 是较老的版本，所以最好保持 Java 使用 1.8 的版本。在这个 demo 完成的过程中，由于使用了 Java17，一直报错

```cmd
Unable to make protected final java.lang.Class java.lang.ClassLoader.defineClass
```

把运行环境降为 1.8 后，问题得以解决
