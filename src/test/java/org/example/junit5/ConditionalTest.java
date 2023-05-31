package org.example.junit5;

public class ConditionalTest {

    DemoUtils demoUtils;

    @BeforeEach
    void setup() {
        demoUtils = new DemoUtils();
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void windowsTest() {

    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void linuxTest() {

    }

    @Test
    @EnabledOnOs({OS.LINUX, OS.WINDOWS})
    void windowsAndLinuxTest() {

    }

    @Test
    @EnabledOnJre(JRE.JAVA_11)
    void java11Test() {

    }

    @Test
    @EnabledOnJre(JRE.JAVA_14)
    void java14Test() {

    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void java17Test() {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_13, max = JRE.JAVA_17)
    void fromJava13ToJava17() {

    }

    @Test
    @EnabledIfEnvironmentVariable(named = "LUV2CODE_ENV", matches = "DEV") //Edit configuration -> application environments
    void testOnlyForDevEnvironment() {

    }

    @Test
    @EnabledIfSystemProperty(named = "LUV2CODE_SYS_PROP", matches = "CI_CD_DEPLOY")
    void testOnlyForSystemProperty() {

    }