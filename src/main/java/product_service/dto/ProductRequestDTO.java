package product_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record ProductRequestDTO(
        @NotBlank(message = "El nombre del producto no puede estar vacío")
        String name,

        String description, // Este es opcional, lo dejamos sin validación

        @NotNull(message = "El precio del producto no puede ser nulo")
        @Positive(message = "El precio del producto debe ser mayor a cero")
        double price
) {
}
