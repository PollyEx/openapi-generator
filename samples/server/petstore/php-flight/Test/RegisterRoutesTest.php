<?php

/**
 * OpenAPI Petstore
 * PHP version 8.x
 *
 * @package OpenAPIServer
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

namespace OpenAPIServer\Test;

use function OpenAPIServer\parseParam;

class RegisterRoutesTest extends \PHPUnit\Framework\TestCase {
    public function testRegisterRoutesAbstractPetApi(): void
    {
        $handler = new class extends \OpenAPIServer\Api\AbstractPetApi {
            public function addPet(\OpenAPIServer\Model\Pet $pet): \OpenAPIServer\Model\Pet|null
            {
                return null;
            }
        };
        \OpenAPIServer\RegisterRoutes::registerRoutes($handler);
        $this->assertTrue(true);
    }
    public function testRegisterRoutesAbstractStoreApi(): void
    {
        $handler = new class extends \OpenAPIServer\Api\AbstractStoreApi {
            public function deleteOrder(string $orderId): void
            {
            }
        };
        \OpenAPIServer\RegisterRoutes::registerRoutes($handler);
        $this->assertTrue(true);
    }
    public function testRegisterRoutesAbstractUserApi(): void
    {
        $handler = new class extends \OpenAPIServer\Api\AbstractUserApi {
            public function createUser(\OpenAPIServer\Model\User $user): void
            {
            }
        };
        \OpenAPIServer\RegisterRoutes::registerRoutes($handler);
        $this->assertTrue(true);
    }
    public function testParseParamsEnumFindPetsByStatusStatusParameterInner(): void
    {
        $value = 'available';
        $this->assertEquals(
            parseParam($value, '\\OpenAPIServer\\Model\\FindPetsByStatusStatusParameterInner'),
            \OpenAPIServer\Model\FindPetsByStatusStatusParameterInner::AVAILABLE
        );
    }
    public function testParseParamsEnumOrderStatus(): void
    {
        $value = 'placed';
        $this->assertEquals(
            parseParam($value, '\\OpenAPIServer\\Model\\OrderStatus'),
            \OpenAPIServer\Model\OrderStatus::PLACED
        );
    }
    public function testParseParamsEnumPetStatus(): void
    {
        $value = 'available';
        $this->assertEquals(
            parseParam($value, '\\OpenAPIServer\\Model\\PetStatus'),
            \OpenAPIServer\Model\PetStatus::AVAILABLE
        );
    }
}
