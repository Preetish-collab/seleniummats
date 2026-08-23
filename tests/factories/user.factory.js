import { faker } from '@faker-js/faker';

export const createUser = () => {
    const firstName = faker.person.firstName();

    return {
        name: firstName,
        firstName,
        email:faker.internet.email(),
        password:faker.internet.password(),

        day:faker.number.int({min:1,max:28}).toString(),
        month:faker.number.int({min:1,max:12}).toString(),
        year:faker.number.int({min:1970,max:2026}).toString(),

        lastName: faker.person.lastName(),
        company:faker.company.name(),

        address1:faker.location.streetAddress(),
        address2:faker.location.secondaryAddress(),
        city:faker.location.city(),
        state:faker.location.state(),
        zipcode:faker.location.zipCode(),

        mobileNumber: `9${faker.number.int({ min: 100000000, max: 999999999 })}`
    };
};