
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import UserManager from "./components/listers/UserCards"
import UserDetail from "./components/listers/UserDetail"
import CompanyManager from "./components/listers/CompanyCards"
import CompanyDetail from "./components/listers/CompanyDetail"
import MachineManager from "./components/listers/MachineCards"
import MachineDetail from "./components/listers/MachineDetail"
import ProductManager from "./components/listers/ProductCards"
import ProductDetail from "./components/listers/ProductDetail"
import ProgressManager from "./components/listers/ProgressCards"
import ProgressDetail from "./components/listers/ProgressDetail"

import CommandManager from "./components/listers/CommandCards"
import CommandDetail from "./components/listers/CommandDetail"
import WorkjobManager from "./components/listers/WorkjobCards"
import WorkjobDetail from "./components/listers/WorkjobDetail"

import PurchaseOrderManager from "./components/listers/PurchaseOrderCards"
import PurchaseOrderDetail from "./components/listers/PurchaseOrderDetail"
import PurchaseInManager from "./components/listers/PurchaseInCards"
import PurchaseInDetail from "./components/listers/PurchaseInDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/users',
                name: 'UserManager',
                component: UserManager
            },
            {
                path: '/users/:id',
                name: 'UserDetail',
                component: UserDetail
            },
            {
                path: '/companies',
                name: 'CompanyManager',
                component: CompanyManager
            },
            {
                path: '/companies/:id',
                name: 'CompanyDetail',
                component: CompanyDetail
            },
            {
                path: '/machines',
                name: 'MachineManager',
                component: MachineManager
            },
            {
                path: '/machines/:id',
                name: 'MachineDetail',
                component: MachineDetail
            },
            {
                path: '/products',
                name: 'ProductManager',
                component: ProductManager
            },
            {
                path: '/products/:id',
                name: 'ProductDetail',
                component: ProductDetail
            },
            {
                path: '/progresses',
                name: 'ProgressManager',
                component: ProgressManager
            },
            {
                path: '/progresses/:id',
                name: 'ProgressDetail',
                component: ProgressDetail
            },

            {
                path: '/commands',
                name: 'CommandManager',
                component: CommandManager
            },
            {
                path: '/commands/:id',
                name: 'CommandDetail',
                component: CommandDetail
            },
            {
                path: '/workjobs',
                name: 'WorkjobManager',
                component: WorkjobManager
            },
            {
                path: '/workjobs/:id',
                name: 'WorkjobDetail',
                component: WorkjobDetail
            },

            {
                path: '/purchaseOrders',
                name: 'PurchaseOrderManager',
                component: PurchaseOrderManager
            },
            {
                path: '/purchaseOrders/:id',
                name: 'PurchaseOrderDetail',
                component: PurchaseOrderDetail
            },
            {
                path: '/purchaseIns',
                name: 'PurchaseInManager',
                component: PurchaseInManager
            },
            {
                path: '/purchaseIns/:id',
                name: 'PurchaseInDetail',
                component: PurchaseInDetail
            },



    ]
})
