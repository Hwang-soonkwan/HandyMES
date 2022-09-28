<template>
    <div>
        <v-list two-line v-if="list.length > 0">
            <v-list-item-group 
                    v-model="selected" 
                    color="indigo"
                    @change="select"
            >
                <v-list-item v-for="(item, idx) in list" :key="idx">
                    <template v-slot:default="{ active }">
                        <v-list-item-avatar color="grey darken-1">
                        </v-list-item-avatar>
                        
                        <v-list-item-content>
                            <v-list-item-title>
                            </v-list-item-title>
                            <v-list-item-subtitle>
                                Cidx :  {{item.cidx }}
                            </v-list-item-subtitle>
                            <v-list-item-subtitle>
                                TenantId :  {{item.tenantId }}
                            </v-list-item-subtitle>
                            <v-list-item-subtitle>
                                CompNo :  {{item.compNo }}
                            </v-list-item-subtitle>
                            <v-list-item-subtitle>
                                CompNm :  {{item.compNm }}
                            </v-list-item-subtitle>
                            <v-list-item-subtitle>
                                CompLicenceCode :  {{item.compLicenceCode }}
                            </v-list-item-subtitle>
                            <v-list-item-subtitle>
                                CompType :  {{item.compType }}
                            </v-list-item-subtitle>
                            <v-list-item-subtitle>
                                CeoNm :  {{item.ceoNm }}
                            </v-list-item-subtitle>
                            <v-list-item-subtitle>
                                TelNumber :  {{item.telNumber }}
                            </v-list-item-subtitle>
                            <v-list-item-subtitle>
                                FaxNumber :  {{item.faxNumber }}
                            </v-list-item-subtitle>
                            <v-list-item-subtitle>
                                CompEmail :  {{item.compEmail }}
                            </v-list-item-subtitle>
                            <v-list-item-subtitle>
                                RegiNm :  {{item.regiNm }}
                            </v-list-item-subtitle>
                            <v-list-item-subtitle>
                                RegiTm :  {{item.regiTm }}
                            </v-list-item-subtitle>
                            <v-list-item-subtitle>
                                ModiNm :  {{item.modiNm }}
                            </v-list-item-subtitle>
                        </v-list-item-content>

                        <v-list-item-action>
                            <v-checkbox :input-value="active" color="indigo"></v-checkbox>
                        </v-list-item-action>
                    </template>
                </v-list-item>
            </v-list-item-group>
        </v-list>
    </div>
</template>


<script>
    const axios = require('axios').default;

    export default {
        name: 'CompanyPicker',
        props: {
            value: [String, Object, Array, Number, Boolean],
        },
        data: () => ({
            list: [],
            selected: null,
        }),
        async created() {
            var me = this;
            var temp = await axios.get(axios.fixUrl('/companies'))
            if(temp.data) {
                me.list = temp.data._embedded.companies;
            }

            if(me.value && typeof me.value == "object" && Object.values(me.value)[0]) {
                var id = Object.values(me.value)[0];
                var tmpValue = await axios.get(axios.fixUrl('/companies/' + id))
                if(tmpValue.data) {
                    var val = tmpValue.data
                    me.list.forEach(function(item, idx) {
                        if(item.name == val.name) {
                            me.selected = idx
                        }
                    })
                }
            }
        },
        methods: {
            select(val) {
                var obj = {}
                if(val != undefined) {
                    var arr = this.list[val]._links.self.href.split('/');
                    obj['cidx'] = arr[4]; 
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    this.$emit('selected', obj);
                }
            },
        },
    };
</script>

