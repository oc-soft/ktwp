/*
 * Copyright 2022 oc-soft
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:JsModule("@wordpress/blocks")
@file:JsNonModule
package wordpress.blocks

/**
 * register block type
 */
external fun registerBlockType(
    blockNameOrMetaData: dynamic, settings: dynamic): dynamic

/**
 * get block type
 */
external fun getBlockType(
    name: String): dynamic 

/**
 * unregister block type
 */
external fun unregisterBlockType(
    name: String): dynamic


/**
 * create block object parameter
 */
external fun createBlock(
    name: String, 
    attributes: dynamic, 
    innerBlocks: Array<dynamic> = definedExternally): dynamic



// vi: se ts=4 sw=4 et:
