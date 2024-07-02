/**
* Test swagger file
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/

/*
* StoreApiImpl.h
*
* 
*/

#ifndef STORE_API_IMPL_H_
#define STORE_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>
#include <optional>

#include <StoreApi.h>


#include "OuterType.h"

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::model;

class  StoreApiImpl : public org::openapitools::server::api::StoreApi {
public:
    explicit StoreApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~StoreApiImpl() override = default;

    void get_nested_object(Pistache::Http::ResponseWriter &response);

};

} // namespace org::openapitools::server::api



#endif
