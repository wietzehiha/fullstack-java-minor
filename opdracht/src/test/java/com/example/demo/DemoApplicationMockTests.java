package com.example.demo;

import com.example.demo.service.stringService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import static org.mockito.Mockito.*;

@SpringBootTest
public class DemoApplicationMockTests {

    stringService test = Mockito.mock(stringService.class);

    @DisplayName("Test Mock StringService")
    @Test
    void testGet() {
        when(test.get()).thenReturn("dit is een test");
    }
}
