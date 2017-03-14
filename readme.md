**Create db:**
CREATE SCHEMA `phone_book` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;

CREATE TABLE `user_contacts` (
  `user_id` bigint(20) NOT NULL,
  `contacts_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_bsi85mivvrqq06j3gfo6tdtn5` (`contacts_id`),
  KEY `FKmo0c5ro6kunnfq71x4bcwb9eh` (`user_id`),
  CONSTRAINT `FKm7a128umfw4itucrfssjdfcdv` FOREIGN KEY (`contacts_id`) REFERENCES `contact` (`id`),
  CONSTRAINT `FKmo0c5ro6kunnfq71x4bcwb9eh` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
)

