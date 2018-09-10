package br.com.agenda.dto;

public class ContactResponseDTO {

    private String id;
    private String name;
    private String telephone;
    private String photo;

    public static class ContactResponseBuilder {
        private ContactResponseDTO dto;

        public ContactResponseBuilder() {
            dto = new ContactResponseDTO();
        }

        public ContactResponseBuilder withId(String id) {
            dto.id = id;
            return this;
        }

        public ContactResponseBuilder withName(String name) {
            dto.name = name;
            return this;
        }

        public ContactResponseBuilder withTelephone(String telephone) {
            dto.telephone = telephone;
            return this;
        }

        public ContactResponseBuilder withPhoto(String photo) {
            dto.photo = photo;
            return this;
        }

        public ContactResponseDTO build() {
            return dto;
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getPhoto() {
        return photo;
    }

}
