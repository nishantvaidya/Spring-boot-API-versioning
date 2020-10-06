# Spring-boot-API-versioning
### URI /v2/employees using @BasePathAwareController annotation and spring.data.rest.basePath=/v2 property
   -  Version is embedded in URI
    - Usually near root
    - Works with caching where URI is key
    - Creates whole new tree with each version
### Header content Accept: application/vnd.globomantics.v2+json. In this case URI doesn't change.
     - Media Type
    -  Define vendor specific media types
    - Used server side to determine what version to use for call
    -   URI does not change
    Non-standard media types can be confusing
### using customer header 
  - Accept-version: v1
  - Accept-version: v2
  - Custom Header
  - Define a custom header for version information
  - Used server side to determine what version to use for call
  - URI does not change
  - More clear than media typ
###  Request Parameter /api/products?version=v1 /api/products?version=v2
    - Request Parameters
    - Define a version parameter
    - Parsed out with other parameters to determine what version to use for call
    - URI does not change
    - Routing can be more difficult than other versioning schemes
###  No versioning 
    -“v1” in URI may never change
    - Simplifies server-side logic
    - Clients don’t need to know any special header information
    - If need a version in the future, just add one - existing becomes “old” default
