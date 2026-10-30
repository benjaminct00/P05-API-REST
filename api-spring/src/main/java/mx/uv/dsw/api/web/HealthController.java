package mx.uv.dsw.api.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

/** Ruta de salud simple para comprobar el despliegue del backend Web 3.0. */
@RestController
public class HealthController {

    @GetMapping("/api/health")
    public ResponseEntity<Map<String, String>> salud() {
        return ResponseEntity.ok(Map.of("status", "UP", "module", "M04"));
    }
}